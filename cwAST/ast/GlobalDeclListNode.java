package ast;

import java.util.List;

public class GlobalDeclListNode extends Node {


    public List<StmtNode> globalDecs;

    public GlobalDeclListNode(List<StmtNode> statements) {
    	for(StmtNode s: statements){
    		System.out.println(s);
    	}
        this.statements = statements;
    }  


}
