public strictfp class datatypes {
    public static strictfp void main(String[] args) {
        float w = 90.20F;
        long ww = 10000L;

        char q = 'न'; //works in ascii code therefore supporting all languages 
        System.out.println(q);
        int age = 22;
        int age1 = age;
        age1 = age1 + 1; // age1++
        System.out.println(age1 + 1);
        System.out.println(age1);
        Integer age2 = 23;
    }
}