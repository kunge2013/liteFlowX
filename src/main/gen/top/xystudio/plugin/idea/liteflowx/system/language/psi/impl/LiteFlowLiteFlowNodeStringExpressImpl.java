// This is a generated file. Not intended for manual editing.
package top.xystudio.plugin.idea.liteflowx.system.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static top.xystudio.plugin.idea.liteflowx.system.language.psi.LiteFlowTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import top.xystudio.plugin.idea.liteflowx.system.language.psi.*;

public class LiteFlowLiteFlowNodeStringExpressImpl extends ASTWrapperPsiElement implements LiteFlowLiteFlowNodeStringExpress {

  public LiteFlowLiteFlowNodeStringExpressImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull LiteFlowVisitor visitor) {
    visitor.visitLiteFlowNodeStringExpress(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof LiteFlowVisitor) accept((LiteFlowVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<LiteFlowLiteFlowDataExpress> getLiteFlowDataExpressList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LiteFlowLiteFlowDataExpress.class);
  }

  @Override
  @Nullable
  public LiteFlowLiteFlowNodeStringRef getLiteFlowNodeStringRef() {
    return findChildByClass(LiteFlowLiteFlowNodeStringRef.class);
  }

  @Override
  @NotNull
  public List<LiteFlowLiteFlowTagExpress> getLiteFlowTagExpressList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, LiteFlowLiteFlowTagExpress.class);
  }

  @Override
  @Nullable
  public PsiElement getBlockComment() {
    return findChildByType(LITEFLOW_BLOCK_COMMENT);
  }

  @Override
  @Nullable
  public PsiElement getLineComment() {
    return findChildByType(LITEFLOW_LINE_COMMENT);
  }

}
