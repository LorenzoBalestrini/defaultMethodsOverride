package it.develhope.defaultMethodsOverride;

public class Test {
    public static void main(String[] args) {

        SmartphonePrice onePlusProd = new SmartphonePrice("Production price",300);
        SmartphonePrice onePlusRet = new SmartphonePrice("Retail price",450);
        SmartphonePrice iPhoneProd = new SmartphonePrice("Production price",500);
        SmartphonePrice iPhoneRet = new SmartphonePrice("Retail price",1000);

        Smartphone onePlus = new Smartphone("OnePlus", "Nord 2",3600,onePlusProd, onePlusRet);
        Smartphone iPhone = new Smartphone("iPhone", "13",4000,iPhoneProd,iPhoneRet);

        System.out.println(onePlus.toString());
        System.out.println(iPhone.toString());

        System.out.println("---------------");

        System.out.println(onePlus.equals(iPhone));

        System.out.println("---------------");

        try{
            Smartphone clonediPhone = iPhone.clone();
            clonediPhone.toString();
            System.out.println(clonediPhone.equals(iPhone));
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Error");
        }


    }
}
