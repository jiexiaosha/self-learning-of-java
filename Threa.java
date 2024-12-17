public class Threa{
    public class BuyTickets extends Thread{
        private String name;
        private String ID;
        public BuyTickets(String name,String ID){
            this.name = name;
            this.ID = ID;
        }    

        @Override
        public void run(){
            StringBuilder pBar = new StringBuilder("[          ]");
            for(int i = 1; i<=10;i++){
                for(int j = 1; j<=9; j++){
                    char a = (char)('0'+j);
                    pBar.setCharAt(i, a);
                }
                pBar.setCharAt(i, '#');
                System.out.print("\r"+pBar);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }

    }
    public static void main(String ARGS[]){
        Threa process = new Threa();
        BuyTickets Axlow = process.new BuyTickets("Axlow", "1234567890");
        Axlow.start();
        BuyTickets Bridget = process.new BuyTickets("Bridget", "1234567891");
        Bridget.start();
        /*the problem is I have 2 names, but there is only 1 process bar on the screen
         * and I should really reread the StringBuilder and StringBuffer
         */
    }

}