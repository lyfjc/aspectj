package concert;
//使用inteliij时，一定要在settings-Compiler-JavaCompiler中，UseCompiler-Ajc,之后 Apply。编译该文件，
//因为默认javac编译器不会编译.aj的文件。
//实在不行，就Build-rebuild
public aspect CriticAspect {
    public CriticAspect(){}
    pointcut performance() : execution(* concert.Performance.perform(..));

    after():performance(){
        System.out.println(criticismEngine.getCriticism());
    }
    private CriticismEngine criticismEngine;
    public void setCriticismEngine(CriticismEngine criticismEngine){
        this.criticismEngine=criticismEngine;
    }
}
