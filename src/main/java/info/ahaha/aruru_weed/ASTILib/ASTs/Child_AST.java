package info.ahaha.aruru_weed.ASTILib.ASTs;

import info.ahaha.aruru_weed.ASTILib.AST;

import java.util.ArrayList;

public class Child_AST implements AST {
    public Child_AST(AST _Parent, String _Label){
        Label = _Label;
        Parent = _Parent;
    }

    AST Parent;
    String Label = "";
    ArrayList<AST> children = new ArrayList<AST>();

    @Deprecated
    public void addChildren(AST... child) {
        for (AST c : child)
            children.add(c);
    }

    public AST getParent() {
        return Parent;
    }

    public ArrayList<AST> getChildren() {
        return children;
    }

    public String getLabel() {
        return Label;
    }
}
