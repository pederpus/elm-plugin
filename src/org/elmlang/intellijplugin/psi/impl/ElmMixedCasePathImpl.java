package org.elmlang.intellijplugin.psi.impl;

import com.intellij.lang.ASTNode;
import org.elmlang.intellijplugin.psi.ElmMixedCasePath;

public class ElmMixedCasePathImpl extends ElmPsiElement implements ElmMixedCasePath {
    public ElmMixedCasePathImpl(ASTNode node) {
        super(node);
    }
}
