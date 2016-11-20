package yaojnTest;

class TestRecursion {
    /**
     * メソッドタイトル.
     * （処理内容記述）
     * @param args
     */
    public static void main(String[] args) {
        String newStr = TestRecursion.reCode("こんにちは,中国!");
        System.out.println(newStr);
    }
    
    //Recursionより、文字変更します。
    public static String reCode(String code){
       if(code == null || code.length() <= 1)
        return code;
    return reCode(code.substring(1))+code.charAt(0);
    }
}
