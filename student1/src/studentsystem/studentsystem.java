
	package studentsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class studentsystem {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection c = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/student_system?characterEncoding=UTF-8", "root", "123456");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		tool t = new tool();
		boolean exit = false;
		int c1 = 0;
		int c2 = 0;
		int c3 = 0;
		int c4 = 0;

		while (exit == false) {
			System.out.print("你想要执行怎样的操作？ 按1添加数据，按2删除数据，按3更改数据，按4退出");
			Scanner in = new Scanner(System.in);
			c1 = in.nextInt();
			if (c1 == 1) {
				System.out.print("按1添加学生的数据，按2添加课程的数据，按3修改连接表数据，按4退出");
				c2 = in.nextInt();
				if (c2 == 1) {
					System.out.print("请从第38号开始添加，id：姓名：性别");
					int id = in.nextInt();
					String name = in.next();
					String gender = in.next();

					t.addStudent(id, name, gender);

				}
				if (c2 == 2) {
					System.out.print("请从第13号开始添加，id：班级号；专业");
					int classid = in.nextInt();
					String classname = in.next();
					String major = in.next();

					t.addClass(classid, classname, major);

				}
				if (c2 == 3) {
					System.out.print("请从第37号开始添加，学生id，班级id，进入班级的时间");
					int id3 = in.nextInt();
					int id4 = in.nextInt();
					String en = in.next();

					t.addConnect(id3, id4, en);
				}
				if (c2 == 4) {
					exit = true;
				}

			}
			if (c1 == 2) {
				System.out.print("按1删除学生的数据，按2删除课程的数据，按3退出");
				c3 = in.nextInt();
				if (c3 == 1) {
					System.out.print("选择你要删除的id");
					int id1 = in.nextInt();
					t.delstudent(id1);

				}
				if (c3 == 2) {
					System.out.print("选择你要删除的id");
					int id2 = in.nextInt();
					t.delstudent(id2);

				}
				if (c3 == 3) {
					exit = true;
				}

			}
			if (c1 == 3) {
				System.out.print("按1修改学生，按2修改班级，按3退出");
				c4 = in.nextInt();
				if (c4 == 1) {
					System.out.println("输入想要修改的id，和修改后的姓名，性别");
					int id2 = in.nextInt();
					String name2 = in.next();
					String gender2 = in.next();
					t.modifyStudent(id2, name2, gender2);
				}
				if (c4 == 2) {
					System.out.println("输入想要修改的id，和修改后的班级号，专业");
					int classid1 = in.nextInt();
					String classname1 = in.next();
					String major1 = in.next();
					t.modifyClass(classid1, classname1, major1);
				}
				if (c4 == 4) {
					exit = true;
				}

			}
			
		}if (c1 == 4) {
				exit = true;
			}

	}
}