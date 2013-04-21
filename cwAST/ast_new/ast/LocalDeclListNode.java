package ast;

import java.util.List;

public class LocalDeclListNode extends Node {


    public List<VarDeclNode> varDecls;

    public LocalDeclListNode(List<VarDeclNode> varDecls) {
        this.varDecls = varDecls;
    }  


}
