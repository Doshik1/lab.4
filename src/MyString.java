final public class MyString {
    //Scanner sc = new Scanner(System.in);
    final char [] myChars;

    MyString(char[] MyChars){
        this.myChars = MyChars;
    }

    String str = "";
    String ToString() {
        str = new String(myChars);
        /*for (char a : MyChars) {
            str += a;
        }*/
        return str;
    }

   // String str2;

    /*String concat(String str2){
        str += str2;
        return str;
    }*/
    public MyString concat (MyString s){
        char[] newArr = new char[myChars.length + s.myChars.length];
        for (int i = 0; i < myChars.length; i++)
            newArr[i] = myChars[i];

        for (int i = myChars.length; i < newArr.length; i++)
            newArr[i] = s.myChars[i - myChars.length];
        MyString newStr = new MyString(newArr);
        return newStr;
    }

    char charAt(int j){
       return myChars[j];
    }
   // String trim(){
    //    System.arraycopy(myChars,);
    //}

    public static void main(String[] args) {
        char[] cArray = {'d', 'a', 'm', 'n'};
        MyString boba = new MyString(cArray);
        char[] cArray2 = {' ', 'g', 'i', 'r', 'l', '!'};
        MyString str2 = new MyString(cArray2);
        System.out.println(boba.ToString().concat(str2.ToString()) + "  " + boba.concat(str2).charAt(6));
    }
}
