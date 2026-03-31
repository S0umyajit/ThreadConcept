package org.example.com.threadEx.preventThreadMethod.joinEx;
class Medical extends Thread{
    public void run(){
        try {
            System.out.println("Medical start");
            Thread.sleep(2000);
            System.out.println("medical completed");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class DriveTest extends Thread{
    Medical medical;
    DriveTest(Medical medical){
        this.medical=medical;
    }
    public void run(){
        try {
            medical.join();
            System.out.println("Drive Test start");
            Thread.sleep(2000);
            System.out.println("Drive Test completed");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
class LicenseOfficer extends Thread{
    DriveTest driveTest;
    LicenseOfficer(DriveTest driveTest){
        this.driveTest=driveTest;
    }
    public void run(){
        try {
            driveTest.join();
            System.out.println("License Officer start taking exam");
            Thread.sleep(2000);
            System.out.println("License Officer completed exam");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
public class LicenseExJoinMethod {
    public static void main(String[] args) {
        Medical medical=new Medical();
        medical.start();
        DriveTest dt=new DriveTest(medical);
        dt.start();
        LicenseOfficer lo=new LicenseOfficer(dt);
        lo.start();
    }
}
