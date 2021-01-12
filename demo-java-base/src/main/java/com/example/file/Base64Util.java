package com.example.file;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class Base64Util{
    public static void main(String[] args) throws IOException {
        String picStr="data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADwAAAA8CAIAAAC1nk4lAAAC70lEQVR4nOyYTUzTYBjHO8fWyjI2VNYBUzOGZCCrilM8aCJiVOKBiB6MeDV68+BBvRBPxuhFL5wwAglGLsZELyBOo5AohK3r0OEyxocGuoytG+C6jbX1QELGR8Zayqsk7+/YPh+/LFmT/5MnCAKy3djxrwWkAKVBAaVBAaVBAaVBAaVBAaVBAaVBkSehh0tx3jejTIDR7S1AFIqiyj2GaoNSpdwCvfVRiAoBXIpztZOhHyHLOYt+n07gBZZhqZce+017SU3xVnquIFdpPs0HHOPfu0eI64S5zpz5KugJfn327eiNGlOtKZdR8XDc3zOGZO5VKIoPG4uqiuSUjk5GqS6q9Lip1F6C6bG1BWyEJTvIdJI7dsu+bkFsKhbyhmh3EEEQtUZtqi1Fdejy2+R86tfAFBtNGAnc2mjdrDSf5skOMvBhvOHpBY1Bk33WxOdJZ5uzqfNS5sN4OO56QS7QC1WXK42HjKp8VZYJjpaPAscTzcQGv7qQldjvmOeVJ3tNJvMz86ue9D8ZmB6ezn0CTdG9d3tdHWSWGnF/xP+EbfmdhtKggNKggNKggNKggNKggNKgECfNRhNbZiICcdL9j75wi5wsi3mOH+ke6bnTI6FXnHSBSTfc5pTFm+qiQt7Z+of1EnrFSRPNtuRc8udbn4RNyyRiif7HAyqNuu7B6TxUyg1DdHJJziUdLQ5ro3VVJs8FgRcGW4cW/yweaCjHCVxs+zJS4haX4t7f6ys+Yqy+Wp37jYZ2087nrvLzloqLFeI9VyAxI7IMO9g6hGrRg1eqtCXaDetnSNrd6T5xu1a/Xy/JcwWbCrb+3jHfO59SrcRteGWTFdWia2v4NO9qJyP+yKn7JzHdOicRCciQxlmGDfQFxj9NqHaqcBtusBl2WQoxHRb2R8K+sPe113zGTFyzyaK7hJwnBJZhg1SQCTCzo7MIgmB6rLCssOxsWf7ufLlWLAHvHqCA0qCA0qCA0qCA0qCA0qCA0qD4GwAA//9t18Gql4shYAAAAABJRU5ErkJggg==";

        //Base64.Decoder decoder=Base64.getDecoder();

        byte[] decodedBytes = Base64.getDecoder().decode(picStr);
        File file = new File("F://aa");
        if(!file.exists()){
            file.mkdirs();  //如果文件目录不存在则创建
        }
        File realFile=new File("F://aa//bb.png");
        if(!realFile.exists()){
            realFile.createNewFile();

        }
        FileOutputStream os=new FileOutputStream(realFile);
        os.write(decodedBytes);
        os.close();
    }



}
