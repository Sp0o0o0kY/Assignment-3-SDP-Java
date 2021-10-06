public class SeniorPythonDeveloperDecorator extends BaseDecorator{

    public SeniorPythonDeveloperDecorator(Developer developer) {
        super(developer);
    }

    String makeCodeReview() {
        return "Checking the code again...";
    }

    @Override
    public String makeJob(){
        return super.makeJob() + makeCodeReview();
    }
}
