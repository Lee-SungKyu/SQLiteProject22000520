import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		
		Connection con = null;
		
		try
		{
			
			// SQLite JDBC 체크
			Class.forName("org.sqlite.JDBC");
			
			// SQLite 데이터베이스 파일에 연결
			String dbFile = "myfirst.db";
			con = DriverManager.getConnection("jdbc:sqlite:" + dbFile);
			//////////////////////////////////////////////////////////////////////////////////////////////////////////
			/*
			// 데이터 조회
			System.out.println("\n*** 데이터 조회 ***");
			// 객체 생성 (Statement)
			Statement stat1 = con.createStatement();
			// 조회하기 위한 Query 생성
			String sql1 = "select * from g_artists";
			// Query 결과 값은 ResultSet res1으로, 실행
			ResultSet rs1 = stat1.executeQuery(sql1);
			
			// 한줄씩 데이터가 있으면 타입 별로 읽는다
			
			while ( rs1.next())
			{
				String id = rs1.getString("id");
				String name = rs1.getString("name");
				String a_type = rs1.getString("a_type");
				String a_year = rs1.getString("a_year");
				String debut = rs1.getString("debut");
				String regdate = rs1.getString("regdate");
				System.out.println(id + " " + name + " " + a_type + " " + a_year + " " + debut + " " + regdate);
			}
			// Statement를 Close
			stat1.close();
			*/
			//////////////////////////////////////////////////////////////////////////////////////////////////////////
			/*
			// 데이터 추가
			System.out.println("\n*** 새 데이터 추가 ***");
			Statement stat2 = con.createStatement();
			String sql2 = "insert into g_artists (name, a_type, a_year, debut, regdate)"
				+ " values ('방탄소년단', '남성', '2010년대', '2013년', datetime('now','localtime'));";
			
			int cnt = stat2.executeUpdate(sql2);
			if (cnt > 0)
			{
				System.out.println("새로운 데이터가 추가되었습니다!");
			}
			else
			{
				System.out.println("[Error] 데이터 추가 오류!");
			}
			stat2.close();
			*/
			
			//////////////////////////////////////////////////////////////////////////////////////////////////////////
			/*
			// 데이터 수정
			System.out.println("\n*** 데이터 수정 ***");
			Statement stat3 = con.createStatement();
			String sql3 = "update g_artists set a_year = '200년대, 2010년대, 2020년대'"
					+ "where id = 1 ;";
			
			int cnt3 = stat3.executeUpdate(sql3);
			
			if(cnt3 >0)
			{
				System.out.println("데이터가 수정되었습니다!");
			}
			else
			{
				System.out.println("[Error] 데이터 수정 오류!");
			}
			stat3.close();
			*/
			//////////////////////////////////////////////////////////////////////////////////////////////////////////
			/*
			// 데이터 삭제
			System.out.println("\n*** 데이터 삭제 ***");
			Statement stat4 = con.createStatement();
			String sql4 = "delete from g_artists where id = 10 ; ";
			
			int cnt4 = stat4.executeUpdate(sql4);
			
			if(cnt4 > 0)
			{
				System.out.println("데이터가 삭제되었습니다!");
			}
			else
			{
				System.out.println("[Error] 데이터 삭제 오류!");
			}
			stat4.close();
			*/
			//////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			if (con != null)
			{
				try
				{
					// Connection을 close
					con.close();
				}
				catch (Exception e) {}
			}
		}
	}

}
