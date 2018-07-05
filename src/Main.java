public class Main {
    public static void main(String[] args) {
        IfElseOperations ifElse = new IfElseOperations();
        ifElse.ifElseMethod("SomeName", -20);
        ifElse.ifElseMethod("SomeName", 30);
        ifElse.ifElseMethod("Andrii", 20);
        SwitchCaseOperations switchCase = new SwitchCaseOperations();
        switchCase.ageResult(20);
        switchCase.ageResult(50);
    }
}
