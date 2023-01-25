package main.java.polymorphism;

public class SamsungTV implements TV{
    @Override
    public void powerOn() {
        System.out.println("삼성TV 킨다");
    }
    @Override
    public void powerOff() {
        System.out.println("삼성TV 끈다");
    }
    @Override
    public void volumeUp() {
        System.out.println("삼성TV 소리올린다");
    }
    @Override
    public void volumeDown() {
        System.out.println("삼성TV 소리내린다");
    }
}
