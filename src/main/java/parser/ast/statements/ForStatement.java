package parser.ast.statements;

import parser.ast.expressions.Expression;

public class ForStatement implements Statement {

    private final Statement init;
    private final Expression term;
    private final Statement inc;
    private final Statement stat;

    public ForStatement(Statement init, Expression term, Statement inc, Statement statement) {
        this.init = init;
        this.term = term;
        this.inc = inc;
        this.stat = statement;
    }

    @Override
    public void execute() {
        for (init.execute(); term.eval().asNumber() != 0; inc.execute()) {
            stat.execute();
        }
    }

    @Override
    public String toString() {
        return String.format("ForStatement(%s;%s;%s) {%s}", init, term, inc, stat);
    }
}
