package info.ahaha.aruru_weed.ASTILib;

import java.util.ArrayList;

public interface AST {
    public default boolean hasChild(){
        return getChildren() != null ? !getChildren().isEmpty() : false;
    }

    public void addChildren(AST... child);

    public ArrayList<AST> getChildren();

    public String getLabel();
}
