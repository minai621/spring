package main.java.polymorphism;

public class LGTV implements TV{
    @Override
    public void powerOn() {
        // TODO Auto-generated method stub
        System.out.println("LGTV 켠다");
    }
     
    @Override
    public void powerOff() {
        // TODO Auto-generated method stub
        System.out.println("LGTV 끈다");
    }
       
    @Override
    public void volumeUp() {
        // TODO Auto-generated method stub
        System.out.println("LGTV 소리올린다.");
    }
       
    @Override
    public void volumeDown() {
        // TODO Auto-generated method stub
        System.out.println("LGTV 소리줄인다.");
    }
       
}
