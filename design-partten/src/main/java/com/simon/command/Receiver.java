package com.simon.command;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 这个模式包括三部分角色：
 * 命令调用者、命令、命令接收者
 */
public class Receiver {
    public void action(){
        System.out.println("接收者的action()方法被调用");
    }
}

interface Command{
    public abstract void execute();
}

class ConcreteCommand implements Command{

    private Receiver receiver;

    ConcreteCommand(){
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}

@Data
@AllArgsConstructor
class Invoker{
    private Command command;

    public void call(){
        System.out.println("调用者执行命令command...");
        command.execute();
    }
}