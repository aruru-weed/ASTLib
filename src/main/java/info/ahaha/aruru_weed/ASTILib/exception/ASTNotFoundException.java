package info.ahaha.aruru_weed.ASTILib.exception;

public class ASTNotFoundException extends Exception{
    String causeLabel;

    public ASTNotFoundException(){}

    public ASTNotFoundException(String Label){
        causeLabel = Label;
    }

    public String getCauseLabel() {
        return causeLabel;
    }
}
