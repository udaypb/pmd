/*
 * User: tom
 * Date: Jun 28, 2002
 * Time: 2:55:48 PM
 */
package test.net.sourceforge.pmd.rules;

import net.sourceforge.pmd.Report;
import net.sourceforge.pmd.rules.IfElseStmtsMustUseBracesRule;

public class IfElseStmtsMustUseBracesRuleTest extends RuleTst {

    public IfElseStmtsMustUseBracesRuleTest(String name) {
        super(name);
    }

    public void testIfElseStmtsMustUseBraces1() {
        Report report = process2("IfElseStmtsNeedBraces1.java", new IfElseStmtsMustUseBracesRule());
        assertEquals(1, report.countViolationsInCurrentFile());
    }
    public void testIfElseStmtsMustUseBraces2() {
        Report report = process2("IfElseStmtsNeedBraces2.java", new IfElseStmtsMustUseBracesRule());
        assertTrue(report.currentFileHasNoViolations());
    }


}
