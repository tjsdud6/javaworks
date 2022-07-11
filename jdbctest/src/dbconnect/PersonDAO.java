package dbconnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dbconnect.common.JDBCUtil;
//DAO(Data Access Object) DB 작업을 수행하는 코드

public class PersonDAO {
	// 업무 용어로 CRUD 라고 함 (Create, Read, Update, Delete) 
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	
	//자료 삽입(Create)
	public void insertPerson(Person person) {
		conn = JDBCUtil.getConnection();
		String sql = "INSERT INTO person(userid, userpw, name, age) VALUES (?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,person.getUserId());
			pstmt.setString(2,person.getUserPw());
			pstmt.setString(3,person.getName());
			pstmt.setInt(4,person.getAge());
			pstmt.executeUpdate();	//db에 저장
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}

	}

	
	//자료 전체 조회(Read)
	public ArrayList<Person> getPersonList(){
		ArrayList<Person> personList = new ArrayList<>();
		//db연결 
		conn = JDBCUtil.getConnection();
		String sql = "SELECT * FROM person";
		try {
			pstmt = conn.prepareStatement(sql);  //sql실행
			rs = pstmt.executeQuery();  //데이터 반환받음

			while(rs.next()) {
				Person person = new Person();
				person.setUserId(rs.getString("userid"));	//db 테이블의 칼럼 입력
				person.setUserPw(rs.getString("userPw"));	//person 객체에 세팅
				person.setName(rs.getNString("name"));		
				person.setAge(rs.getInt("age"));
				
				personList.add(person);	//생성 객체를 어레이리스트에 저장
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}

		return personList;
	}


	
	
	//자료 수정(Update)


	
	
	//자료 삭제(Delete)


}