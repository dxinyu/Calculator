package com.example.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private  StringBuilder show_equation=new StringBuilder();//显示运算式个private StringBuilder的字符串。每按一个按钮，只要满足要求，不是错误的输入，就调用append()方法，将按钮的值当字符存入这个字符串中

    private  ArrayList calculate_equation;//计算式
    private  int signal=0;//为0 时表示刚输入状态；为1 时表示当前在输出结果上继续输入
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator_layout);
        //初始化
        show_equation=new StringBuilder();
        calculate_equation=new ArrayList<>();
        Button zero=(Button)findViewById(R.id.zero);
        Button one=(Button)findViewById(R.id.one);
        Button two=(Button)findViewById(R.id.two);
        Button three=(Button)findViewById(R.id.three);
        Button four=(Button)findViewById(R.id.four);
        Button five=(Button)findViewById(R.id.five);
        Button six=(Button)findViewById(R.id.six);
        Button seven=(Button)findViewById(R.id.seven);
        Button eight=(Button)findViewById(R.id.eight);
        Button nine=(Button)findViewById(R.id.nine);
        Button cls=(Button)findViewById(R.id.cls);
        Button div=(Button)findViewById(R.id.div);
        Button mul=(Button)findViewById(R.id.mul);
        Button backspace=(Button)findViewById(R.id.Backspace);
        Button sub=(Button)findViewById(R.id.sub);
        Button add=(Button)findViewById(R.id.add);
        final Button equal=(Button)findViewById(R.id.equal);
        final Button point=(Button)findViewById(R.id.spot);
        final EditText result=(EditText)findViewById(R.id.result);
        result.setCursorVisible(true); //android:cursorVisible设定光标为显示/隐藏，默认显示
//        disableShowInput(result);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if(!(show_equation.toString().equals("0"))){//将stringBuilder对象通过调用toString()方法转换为String对象并与0比较是否相等
                    if(signal==0){
                        show_equation.append("0");//将0追加至运算式末尾
                        result.setText(show_equation);//文本框显示运算式
                        result.setSelection(result.getText().length());//将光标追踪到内容的最后
                    }else{
                        show_equation.delete(0,show_equation.length());//如果在结果上接着输入数字则将文本框内容清除
                        show_equation.append("0");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                        signal=0;
                    }
                }
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("1");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("1");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("2");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("2");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("3");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("3");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("4");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("4");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("5");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("5");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("6");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("6");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("7");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("7");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("8");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("8");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    show_equation.append("9");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append("9");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });

        //清除文本框内容
        cls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show_equation.delete(0,show_equation.length());//清除文本框内容
                calculate_equation.clear();
                signal=0;
                result.setText("");
            }
        });

        //删除运算式最后一个字符
        backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!(show_equation.toString().equals(""))) {
                    if(signal==0){
                        show_equation.deleteCharAt(show_equation.length() - 1);//删除运算式最后一个字符
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                    }else{
                        show_equation.delete(0,show_equation.length());
                        result.setText("");
                        signal=0;
                    }
                }
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(signal==0){
                    String a=show_equation.toString();
                    if(a.equals("")){
                        show_equation.append(".");
                        result.setText(show_equation);
                        result.setSelection(result.getText().length());
                    }else{
                        int i;
                        char t='0';
                        for(i=a.length();i>0;i--){
                            t=a.charAt(i-1);
                            if(t=='.'||t=='+'||t=='-'||t=='*'||t=='/')
                                break;
                        }
                        if(i==0){
                            show_equation.append(".");
                            result.setText(show_equation);
                            result.setSelection(result.getText().length());
                        }else if(t=='+'||t=='-'||t=='*'||t=='/'){
                            show_equation.append(".");
                            result.setText(show_equation);
                            result.setSelection(result.getText().length());
                        }
                    }
                }else{
                    show_equation.delete(0,show_equation.length());
                    show_equation.append(".");
                    result.setText(".");
                    result.setSelection(result.getText().length());
                    signal=0;
                }
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if(!show_equation.toString().equals("")){
                    signal=1;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(show_equation.charAt(0)=='-')
                        show_equation.insert(0,"0");
                    if(temp=='+'||temp=='-')
                        show_equation.append("0");
                    if(temp=='*'||temp=='/')
                        show_equation.append("1");
                    StringBuilder temp1=new StringBuilder();
                    for(int i=0;i<show_equation.length();i++){
                        if(show_equation.charAt(i)>='0'&&show_equation.charAt(i)<='9'||show_equation.charAt(i)=='.'){
                            temp1.append(String.valueOf(show_equation.charAt(i)));
                        }
                        else
                        {
                            calculate_equation.add(temp1.toString());
                            temp1.delete(0,temp1.length());
                            calculate_equation.add(String.valueOf(show_equation.charAt(i)));
                        }
                    }
                    calculate_equation.add(temp1.toString());
                    calculate_equation.add("#");
                    String temp8=calculate(calculate_equation);
                    result.setText(temp8);
                    result.setSelection(result.getText().length());
                    show_equation.delete(0,show_equation.length());
                    calculate_equation.clear();
                    show_equation.append(temp8);
                }
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if(!(show_equation.toString().equals(""))) {
                    signal=0;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                        show_equation.append("+");
                    }
                    else
                        show_equation.append("+");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if(!(show_equation.toString().equals(""))) {
                    signal=0;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                        show_equation.append("-");
                    }
                    else
                        show_equation.append("-");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if(!(show_equation.toString().equals(""))) {
                    signal=0;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                        show_equation.append("*");
                    }
                    else
                        show_equation.append("*");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判断用户是否输入了内容
                if(!(show_equation.toString().equals(""))) {
                    signal=0;
                    char temp=show_equation.charAt(show_equation.length()-1);
                    if(temp=='+'||temp=='-'||temp=='*'||temp=='/')
                    {
                        show_equation.deleteCharAt(show_equation.length()-1);
                        show_equation.append("/");
                    }
                    else
                        show_equation.append("/");
                    result.setText(show_equation);
                    result.setSelection(result.getText().length());
                }
            }
        });
    }
    //运算符优先级
    protected boolean operatorPriorityCompare(char operator1,char operator2)
    {
        int o1=0;
        int o2=0;
        switch (operator1){
            case '+':{o1=0;break;}
            case '-':{o1=0;break;}
            case '*':{o1=1;break;}
            case '/':{o1=1;break;}
        }
        switch (operator2){
            case '+':{o2=0;break;}
            case '-':{o2=0;break;}
            case '*':{o2=1;break;}
            case '/':{o2=1;break;}
        }
        if(o1<=o2)
        {
            return false;
        }
        else
            return true;
    }
    //相加
    public static double Add(double d1,double d2) {
        return d1+d2;
    }
    //相减
    public static double Sub(double d1,double d2){
        return d1-d2;
    }
    //相乘
    public static double Mul(double d1,double d2){
        return d1*d2;
    }
    //相除
    public static double Div(double d1,double d2){
        return d1*1.0/d2;
    }
    //计算
    protected String calculate(ArrayList equation){
        Double temp2;
        Double temp3;
        Double result;
        ArrayList operator=new ArrayList();//运算符
        ArrayList operand=new ArrayList();//操作数
        for(int i=0;i<equation.size();i++)
        {
            String temp4=(String) equation.get(i);//temp4=运算符
            if(temp4.equals("+")||temp4.equals("-")||temp4.equals("*")||temp4.equals("/"))
            {
                if(operator.size()>0)
                {
                    String temp5=operator.get(operator.size()-1).toString();
                    while(!(operatorPriorityCompare(temp4.charAt(0),temp5.charAt(0)))&&operator.size()>0)
                    {
                        operator.remove(operator.size()-1);
                        //取得两个操作数temp2,temp3
                        temp3=(Double.parseDouble(operand.get(operand.size()-1).toString()));
                        operand.remove(operand.size()-1);
                        temp2=(Double.parseDouble(operand.get(operand.size()-1).toString()));
                        operand.remove(operand.size()-1);
                        switch (temp5.charAt(0)){
                            case '+':{result=Add(temp2,temp3);operand.add(String.valueOf(result));break;}//String.valueOf()方法会首先对转换的对象进行判空检测，如果为空，则返回“null”字符串
                            case '-':{result=Sub(temp2,temp3);operand.add(String.valueOf(result));break;}//将结果追加到操作数组尾部
                            case '*':{result=Mul(temp2,temp3);operand.add(String.valueOf(result));break;}
                            case '/':{result=Div(temp2,temp3);operand.add(String.valueOf(result));break;}
                        }
                        if(operator.size()>0)
                        {
                            temp5=operator.get(operator.size()-1).toString();
                        }
                        else
                            break;
                    }
                    operator.add(temp4);
                }
                else
                    operator.add(temp4);
            }
            else if(temp4.equals("#"))
            {
                while(operator.size()>0)
                {
                    String temp6=(String)operator.get(operator.size()-1);
                    operator.remove(operator.size()-1);
                    temp3=(Double.parseDouble(operand.get(operand.size()-1).toString()));
                    operand.remove(operand.size()-1);
                    temp2=(Double.parseDouble(operand.get(operand.size()-1).toString()));
                    operand.remove(operand.size()-1);
                    switch (temp6.charAt(0)){
                        case '+':{result=Add(temp2,temp3);operand.add(String.valueOf(result));break;}
                        case '-':{result=Sub(temp2,temp3);operand.add(String.valueOf(result));break;}
                        case '*':{result=Mul(temp2,temp3);operand.add(String.valueOf(result));break;}
                        case '/':{result=Div(temp2,temp3);operand.add(String.valueOf(result));break;}
                    }
                }
            }
            else
            {
                operand.add(temp4);
            }
        }
        return operand.get(0).toString();
    }
}

