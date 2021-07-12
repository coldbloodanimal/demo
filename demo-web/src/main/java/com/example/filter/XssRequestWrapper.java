package com.example.filter;

import org.springframework.util.StreamUtils;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class XssRequestWrapper extends HttpServletRequestWrapper {
	HttpServletRequest orgRequest = null;

	private static final String CHARSET_UTF8 = "UTF-8";
	private String bodyString="";
	private final byte[] body;


	public XssRequestWrapper(HttpServletRequest request) throws IOException {
		super(request);
		orgRequest = request;


		//this.bodyString = IOUtils.toString(request.getReader());
		//this.bodyString = StreamUtils.copyToString(request.getInputStream(), Charset.forName(CHARSET_UTF8));
		body = xssEncode(bodyString).getBytes(CHARSET_UTF8);
	}

	/**
	 * 覆盖getParameter方法，将参数名和参数值都做xss过滤。<br/>
	 * 如果需要获得原始的值，则通过super.getParameterValues(name)来获取<br/>
	 * getParameterNames,getParameterValues和getParameterMap也可能需要覆盖
	 */
	@Override
	public String getParameter(String name) {
		String value = super.getParameter(xssEncode(name));
		if (value != null) {
			value = xssEncode(value);
		}
		return value;
	}

	/**
	 * 覆盖getHeader方法，将参数名和参数值都做xss过滤。<br/>
	 * 如果需要获得原始的值，则通过super.getHeaders(name)来获取<br/>
	 * getHeaderNames 也可能需要覆盖
	 */
	@Override
	public String getHeader(String name) {

		String value = super.getHeader(xssEncode(name));
		if (value != null) {
			value = xssEncode(value);
		}
		return value;
	}

	/**
	 * 将容易引起xss漏洞的半角字符直接替换成全角字符
	 *
	 * @param s
	 * @return
	 */
	private static String xssEncode(String s) {
		if (s == null || s.isEmpty()) {
			return s;
		}
		StringBuilder sb = new StringBuilder(s.length() + 16);
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
				case '>':
					sb.append('＞');//全角大于号
					break;
				case '<':
					sb.append('b');//全角小于号
					break;
				case '\'':
					sb.append('‘');//全角单引号
					break;
				case '\"':
					sb.append('“');//全角双引号
					break;
				case '&':
					sb.append('＆');//全角
					break;
				case '\\':
					sb.append('＼');//全角斜线
					break;
				case '#':
					sb.append('＃');//全角井号
					break;
				default:
					sb.append(c);
					break;
			}
		}
		return sb.toString();
	}

	/**
	 * 获取最原始的request
	 *
	 * @return
	 */
	public HttpServletRequest getOrgRequest() {
		return orgRequest;
	}

	/**
	 * 获取最原始的request的静态方法
	 *
	 * @return
	 */
	public static HttpServletRequest getOrgRequest(HttpServletRequest req) {
		if (req instanceof XssRequestWrapper) {
			return ((XssRequestWrapper) req).getOrgRequest();
		}

		return req;
	}

	@Override
	public BufferedReader getReader() throws IOException {
		return new BufferedReader(new InputStreamReader(getInputStream()));
	}

	public void setBody(byte[] body){
		body = body;
	}

	@Override
	public ServletInputStream getInputStream() throws IOException {

		final ByteArrayInputStream innerBAIS = new ByteArrayInputStream(body);

		return new ServletInputStream() {
			public boolean isFinished() {
				return false;
			}

			public boolean isReady() {
				return false;
			}

			public void setReadListener(ReadListener readListener) {

			}
			@Override
			public int read() throws IOException {
				return innerBAIS.read();
			}
	};
	}


}