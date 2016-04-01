package toothpick.compiler.memberinjector;

public class MemberInjectorGenerator {

  private static final String MEMBER_INJECTOR_SUFFIX = "$$MemberInjector";

  private MemberInjectorInjectionTarget memberInjectorInjectionTarget;

  public MemberInjectorGenerator(MemberInjectorInjectionTarget memberInjectorInjectionTarget) {
    this.memberInjectorInjectionTarget = memberInjectorInjectionTarget;
  }

  public String brewJava() {
    /*TypeSpec.Builder injectorTypeSpec =
        TypeSpec.classBuilder(injectionTarget.className + MemberInjector_SUFFIX)
            .addModifiers(Modifier.PUBLIC);
    emitInject(injectorTypeSpec);
    JavaFile javaFile = JavaFile.builder(target.classPackage, injectorTypeSpec.build())
        .addFileComment("Generated code from Dart. Do not modify!")
        .build();
    return javaFile.toString();*/
    return "";
  }

  public String getFqcn() {
    return memberInjectorInjectionTarget.getFqcn() + MEMBER_INJECTOR_SUFFIX;
  }
}