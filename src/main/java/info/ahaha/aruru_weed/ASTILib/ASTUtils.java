package info.ahaha.aruru_weed.ASTILib;

import com.google.common.base.Strings;

import static org.bukkit.Bukkit.getLogger;

public class ASTUtils {
    public static void dump(AST ast) {
        int indent = 0;
        getLogger().info(ast.getLabel());
        if (ast.hasChild())
            for (AST c_ast : ast.getChildren())
                dump(c_ast, indent);
    }

    static void dump(AST ast, int indent) {
        indent++;
        getLogger().info(Strings.repeat("| ", indent - 1) + "|-" + ast.getLabel());
        if (ast.hasChild())
            for (AST c_ast : ast.getChildren())
                dump(c_ast, indent);
    }
}
