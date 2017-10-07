package no.uio.ifi.asp.parser;

import no.uio.ifi.asp.main.Main;
import no.uio.ifi.asp.runtime.RuntimeReturnValue;
import no.uio.ifi.asp.runtime.RuntimeScope;
import no.uio.ifi.asp.runtime.RuntimeValue;
import no.uio.ifi.asp.scanner.Scanner;

import static no.uio.ifi.asp.scanner.TokenKind.notToken;

public class AspName extends AspAtom{

    AspName(int n) {
        super(n);
    }

    public static AspName parse(Scanner s) {
        Main.log.enterParser("AspName");
        AspName name = new AspName(s.curLineNum());



        Main.log.leaveParser("AspName");
        return name;
    }


    @Override
    protected void prettyPrint() {

    }

    @Override
    RuntimeValue eval(RuntimeScope curScope) throws RuntimeReturnValue {
        return null;
    }
}
