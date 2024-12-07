public class overR_and_L {

    public class Gamer{
        private String name;
        private String game;
        
        public Gamer(String name, String game){
            this.name = name;
            this.game = game;
        }
        public String getName(){
            return name;
        }
        public String getGame(){
            return game;
        }

        public void gaming(){
        }
    }

    public class Gaming extends Gamer{
        public Gaming(String name, String game){
            super(name,game);
        }

        @Override
        public void gaming(){
            System.out.println(getName() + " is playing " + getGame());
        }
    }


    public static void main(String args[]){
        overR_and_L ex = new overR_and_L();
        Gaming Axlow = ex.new Gaming("Axlow", "Genshin");
        /*I first use class Gamer and you know what will happen+0
         * 
         */
        Axlow.gaming();
    }
}
