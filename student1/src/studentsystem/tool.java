package studentsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class tool {
	public static Connection getConnection(){
		Connection conn = null;
		 try {
			 	//初始化驱动类com.mysql.jdbc.Driver
	            Class.forName("com.mysql.jdbc.Driver");
	            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student_system?characterEncoding=UTF-8","root", "123456");
	            //该类就在 mysql-connector-java-5.0.8-bin.jar中,如果忘记了第一个步骤的导包，就会抛出ClassNotFoundException
	        } catch (ClassNotFoundException e) { 				
	            e.printStackTrace();
	        }catch (SQLException e) {							
	            e.printStackTrace();
	        }
		 return conn;
	}
	/**
	* 添加学生
	* 
	*/
	public void addStudent(int id,String name,String gender){
	String sql = "insert into student(id,name,gender) values(?,?,?)";  
	//该语句为每个 IN 参数保留一个问号（“？”）作为占位符
	Connection conn = null;				//和数据库取得连接
	PreparedStatement pstmt = null;		//创建statement
	try{
		conn = tool.getConnection();
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);//给占位符赋值
		pstmt.setString(3, gender);//给占位符赋值
		pstmt.executeUpdate();			//执行
	}catch(SQLException e){
		e.printStackTrace();
	}
	finally{
		tool.close(pstmt);
		tool.close(conn);		//必须关闭
	}
	}
	/**
	* 添加班级
	* 
	*/
	public void addClass(int classid,String classname,String majorname){
	String sql = "insert into student(classid,classname,majorname) values(?,?,?)";  
	//该语句为每个 IN 参数保留一个问号（“？”）作为占位符
	Connection conn = null;				//和数据库取得连接
	PreparedStatement pstmt = null;		//创建statement
	try{
		conn = tool.getConnection();
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
		pstmt.setInt(1, classid);
		pstmt.setString(2, classname);//给占位符赋值
		pstmt.setString(3, majorname);//给占位符赋值
		pstmt.executeUpdate();			//执行
	}catch(SQLException e){
		e.printStackTrace();
	}
	finally{
		tool.close(pstmt);
		tool.close(conn);		//必须关闭
	}
	}
	/**
	* 添加学生和班级的连接
	* 
	*/
	public void addConnect(int id,int classid,String entertime){
	String sql = "insert into student(classid,id,enter_time) values(?,?,?)";  
	//该语句为每个 IN 参数保留一个问号（“？”）作为占位符
	Connection conn = null;				//和数据库取得连接
	PreparedStatement pstmt = null;		//创建statement
	try{
		conn = tool.getConnection();
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
		pstmt.setInt(1, classid);
		pstmt.setInt(2, id);//给占位符赋值
		pstmt.setString(3, entertime);//给占位符赋值
		pstmt.executeUpdate();			//执行
	}catch(SQLException e){
		e.printStackTrace();
	}
	finally{
		tool.close(pstmt);
		tool.close(conn);		//必须关闭
	}
	}
    /**
 * 删除学生和它的连接
 * 
 */
public void delstudent(int id){
	String sql = "delete connect,student FROM student,connect  WHERE  student.id=? or connect.id=?";
	Connection conn = null;
	PreparedStatement pstmt = null;
	try {
		conn = tool.getConnection();
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setInt(2, id);
		pstmt.executeUpdate();
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally{
		tool.close(pstmt);
		tool.close(conn);		//必须关闭
	}
}

//删除班级和它的连接
public void delclass(int id){
	String sql = "delete connect,class FROM student,class  WHERE  class.classid=? or connect.classid=?";
	Connection conn = null;
	PreparedStatement pstmt = null;
	try {
		conn = tool.getConnection();
		pstmt = (PreparedStatement) conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setInt(2, id);
		pstmt.executeUpdate();
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}finally{
		tool.close(pstmt);
		tool.close(conn);		//必须关闭
	}
}
/**
* 修改学生信息
*/
public void modifyStudent(int id,String name,String gender){
String sql = "update student set name =? ,gender=? where id=?";
Connection conn = null;
PreparedStatement pstmt = null;
try {
	conn = tool.getConnection();
	pstmt = (PreparedStatement) conn.prepareStatement(sql);
	pstmt.setString(1, name);  //利用Preparedstatement的set方法给占位符赋值
	pstmt.setString(2, gender);
	pstmt.setInt(3, id);
	
	pstmt.executeUpdate();
} catch (SQLException e) {
	// TODO: handle exception
	e.printStackTrace();
}finally{
	tool.close(pstmt);
	tool.close(conn);		//必须关闭
}
}

/**
* 修改班级信息
*/
public void modifyClass(int classid,String classname,String majorname){
String sql = "update class set classname =? ,majorname=? where classid=?";
Connection conn = null;
PreparedStatement pstmt = null;
try {
	conn = tool.getConnection();
	pstmt = (PreparedStatement) conn.prepareStatement(sql);
	pstmt.setString(1, classname);  //利用Preparedstatement的set方法给占位符赋值
	pstmt.setString(2, majorname);
	pstmt.setInt(3, classid);
	
	pstmt.executeUpdate();
} catch (SQLException e) {
	// TODO: handle exception
	e.printStackTrace();
}finally{
	tool.close(pstmt);
	tool.close(conn);		//必须关闭
}
}
/**
* 查询学生
* @return
*/


	/**
	 * 封装三个关闭方法
	 * @param pstmt
	 */
	public static void close(PreparedStatement pstmt){
		if(pstmt != null){						//避免出现空指针异常
			try{
				pstmt.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
			
		}
	}

	public static void close(Connection conn){
		if(conn != null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

	
	
}
