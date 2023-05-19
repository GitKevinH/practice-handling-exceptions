package org.ctac.java103;


public class Main {
    public static void main(String[] args) {

        //Part 1
//        StandardSensor ten = new StandardSensor(10);
//        StandardSensor minusFive = new StandardSensor(-5);
//
//        System.out.println(ten.read());
//        System.out.println(minusFive.read());
//
//        System.out.println(ten.isOn());
//        ten.setOff();
//        System.out.println(ten.isOn());

        //Part 2

//        TemperatureSensor tempSensor = new TemperatureSensor();
//
//        // to test initialization of class
//        try {
//            System.out.println(tempSensor.read());
//        } catch (IllegalStateException ise) {
//            System.out.println(ise.getMessage());
//        }
//
//        //to test setOn function
//        tempSensor.setOn();
//
//        try {
//            System.out.println(tempSensor.read());
//        } catch (IllegalStateException ise) {
//            System.out.println(ise.getMessage());
//        }
//
//        // to test setOff function
//        tempSensor.setOff();
//
//        try {
//            System.out.println(tempSensor.read());
//        } catch (IllegalStateException ise) {
//            System.out.println(ise.getMessage());
//        }

        //Part 3
//
//        public static void main(String[] args) {
//            Sensor kumpula = new TemperatureSensor();
//            kumpula.setOn();
//            System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");
//
//            Sensor kaisaniemi = new TemperatureSensor();
//            Sensor helsinkiVantaaAirport = new TemperatureSensor();
//
//            AverageSensor helsinkiRegion = new AverageSensor();
//            helsinkiRegion.addSensor(kumpula);
//            helsinkiRegion.addSensor(kaisaniemi);
//            helsinkiRegion.addSensor(helsinkiVantaaAirport);
//
//            helsinkiRegion.setOn();
//            System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
//        }

        //part 4

//        public static void main(String[] args) {
//            Sensor kumpula = new TemperatureSensor();
//            Sensor kaisaniemi = new TemperatureSensor();
//            Sensor helsinkiVantaaAirport = new TemperatureSensor();
//
//            AverageSensor helsinkiRegion = new AverageSensor();
//            helsinkiRegion.addSensor(kumpula);
//            helsinkiRegion.addSensor(kaisaniemi);
//            helsinkiRegion.addSensor(helsinkiVantaaAirport);
//
//            helsinkiRegion.setOn();
//            System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
//            System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
//            System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
//
//            System.out.println("readings: " + helsinkiRegion.readings());
//        }








    }
}