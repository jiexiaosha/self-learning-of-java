public class examples {
    public class Und{
        private String word = "nihao";

        public String getString(){
            return word;
        }
    }

    public Und U(){
        return new Und();
    }
    public static void main(String[] args){
        System.out.println("hi");
        examples ex1 = new examples();
        examples.Und e1 = ex1.U();
        System.out.println(e1.getString());
    }
}
