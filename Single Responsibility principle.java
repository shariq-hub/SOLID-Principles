// A class Should have one and only reason to change let's understand it with example
//A bad example can be like this one:
class Student{
  int id;
  String name;
  void ChangeDepartment(){//Implmentation}
  void CalculateMarks(){//Implementation}
}
    //Here we are doing manything in just a class rather than create another classes to calculatemarks the basic idea is a class only needs to do one thing only but here we are trying to do multiple things.
    
    
    //A good example can be 
    
    //University Selection teaM
    class Changedepartment{
    public void changedepartment(Student s){
   //Implementation
    }
    }
    
    
    //University criteria team
    class Calculatemarks{
      
      publiv void calculateMarks(Student s){
      //Implementation
      }
    }
