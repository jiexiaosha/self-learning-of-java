import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Dynamic {
    public class gotoClass implements InvocationHandler{
        private Object goClass;
        public gotoClass(Object goClass){
            this.goClass = goClass;
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
            doBeforeClass();
            Object obj = method.invoke(goClass, args);
            doAfterClass();
            return obj;
        }

        private void doBeforeClass(){
            StringBuilder dbfc = new StringBuilder("Need to do before Class");
            System.out.println(dbfc);
        }

        private void doAfterClass(){
            StringBuilder dac = new StringBuilder("Need to do after Class");
            System.out.println(dac);
        }
    }

    public interface diffClass{
        void diffClass(String Clas);
    }
    public class ScienceClass implements diffClass{
        @Override
        public void diffClass(String Clas){
            System.out.println("I will go to have "+Clas+" class.");
        }
    }


    public static void main(String[] args){
        Dynamic d = new Dynamic();
        ScienceClass sc = d.new ScienceClass();
        gotoClass gc = d.new gotoClass(sc);
        diffClass dClass = (diffClass) Proxy.newProxyInstance(sc.getClass().getClassLoader(), sc.getClass().getInterfaces(), gc);
        dClass.diffClass("math"); 
    }
}
