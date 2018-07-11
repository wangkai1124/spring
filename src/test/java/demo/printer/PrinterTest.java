package demo.printer;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.printer.ink.GreyInk;
import demo.printer.paper.TextPaper;
import demo.printer.printer.Ink;
import demo.printer.printer.Printer;



/**
 * 测试打印机。
 * 
 * @author 
 */
public class PrinterTest {

	@Test
	public void eg1() {
		
		/*
		Printer printer=new Printer(); //创建打印机
		Ink ink=new GreyInk();//创建墨盒
		printer.setInk(ink);//安装墨盒
		TextPaper paper=new TextPaper();//创建纸张
		paper.setCharPerLine(5);//设置纸张每行可打印的字符
		paper.setLinePerPage(6);//设置纸张每页可打印的行数
		printer.setPaper(paper);//安装纸张
		*/	
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext2.xml");
		Printer printer=(Printer) context.getBean("printer");
		
		String content = "几位轻量级容器的作者曾骄傲地对我说：这些容器非常有"
				+ "用，因为它们实现了“控制反转”。这样的说辞让我深感迷惑：控"
				+ "制反转是框架所共有的特征，如果仅仅因为使用了控制反转就认为"
				+ "这些轻量级容器与众不同，就好像在说“我的轿车是与众不同的，" + "因为它有4个轮子。”";
		printer.print(content);
	}

}
