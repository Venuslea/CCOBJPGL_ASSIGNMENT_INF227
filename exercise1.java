public class exercise1 {
    static boolean iWillReview = true;
    static boolean iWillNotFail = true;
    
    public static void main(String args[]) {
    
        exercise1 myExercise = new exercise1();
    
        assert iWillReview == true: "hakunamatata";
    
        myExercise.Study();
    
        assert iWillNotFail == true: "eureka";
    
        System.out.println(iWillReview);
        System.out.println(iWillNotFail);
    
    }
    
    void Study(){
        iWillReview = false;
        iWillNotFail = false;
    }
}
