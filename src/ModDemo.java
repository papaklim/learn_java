public class ModDemo {
    public static void main(String[] args){
        System.out.println("Пример целочисленного деления: 10/3");
        int iresult, iresultmod;
        double dresult, dresultmod;
        iresult = 10/3;
        iresultmod = 10%3;
        dresult = 10.0/3.0;
        dresultmod = 10.0%3.0;
        System.out.println("Целые числа - 10/3: "+iresult);
        System.out.println("С плавающей точкой - 10.0/3.0: "+dresult);
        System.out.println("===================================");
        System.out.println("Пример деления по модулю: 10%3");
        System.out.println("Целые числа - 10%3: "+iresultmod);
        System.out.println("С плавающей точкой - 10.0%3.0: "+dresultmod);

    }
}