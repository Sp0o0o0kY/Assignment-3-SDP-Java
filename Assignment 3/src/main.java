public class main {
    public static void main(String[] args){
        Developer developer = new SeniorPythonDeveloperDecorator(new PythonDeveloper());

        System.out.println(developer.makeJob());
    }
}
    