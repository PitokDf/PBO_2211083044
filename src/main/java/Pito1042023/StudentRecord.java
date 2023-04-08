package Pito1042023;

public class StudentRecord {
    private String name;
    private String addres;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    protected double average;

    private static int StudentCount;//class variable
    public static int gst(){
        return StudentCount;
    }

    public StudentRecord(){ 
        StudentCount++; 
        } 
        public StudentRecord(String temp){ 
            this.name = temp;
            StudentCount++;
        } 
        public StudentRecord(String name, String address){ 
            this.name = name; 
            this.addres = addres;
            StudentCount++; 
        } 
        public StudentRecord(double mGrade, double eGrade, double sGrade){ 
            mathGrade = mGrade; 
            englishGrade = eGrade; 
            scienceGrade = sGrade;
            StudentCount++;
        }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddres(){
        return addres;
    }

    public void setAddres(String addres){
        this.addres = addres;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public double getMathGrade(){
        return mathGrade;
    }

    public void setMathgrade(Double mathGrade){
        this.mathGrade = mathGrade;
    }

    public double getenglisGrade(){
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }

    public double getscienceGrade(){
        return scienceGrade;
    }

    public void setscienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }

    public double getaverage(){
        return average;
    }

    public double setaverage(double mathGrade,double englishGrade,double scienceGrade){
        return (mathGrade+englishGrade+scienceGrade)/3;
    }

    public int getStudentCount(){
        return StudentCount;
    }

    public void setStudentCount(int StudentCount){
        this.StudentCount = StudentCount;
    }

    public void print( String temp ){ 
        System.out.println("Name    : " + name); 
        System.out.println("Address : " + addres); 
        System.out.println("Age     : " + age);
        } 
        public void print(double eGrade, double mGrade, double sGrade){
        System.out.println("Name          : " + name); 
        System.out.println("Math Grade    : " + mGrade); 
        System.out.println("English Grade : " + eGrade); 
        System.out.println("Science Grade : " + sGrade);
    }
    public void NilaiHuruf(double average){
        if (average>80){
            System.out.println("A");
        }else if(average>65){
            System.out.println("B");
        }else if (average>55){
            System.out.println("C");
        }else if (average>40){
            System.out.println("D");
        }else if (average>0){
            System.out.println("E");
        }else{
            System.out.println(" ");
        }
    }
}
