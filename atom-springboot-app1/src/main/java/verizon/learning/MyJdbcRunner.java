package verizon.learning;

import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;

import com.mysql.jdbc.Connection;

@Component
public class MyJdbcRunner implements CommandLineRunner{

	@Autowired
	JdbcTemplate jt;
		

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*UnComment this to Insert data
		String INSERT_EMP="insert into EMP(empno, name, address, salary) values(?,?,?,?)";
		int count = jt.update(new PreparedStatementCreator() {
			
			@Override
			public PreparedStatement createPreparedStatement(java.sql.Connection con) throws SQLException {
				// TODO Auto-generated method stub
				PreparedStatement pst = con.prepareStatement(INSERT_EMP);
				pst.setInt(1, 1010);
				pst.setString(2, "Prakash1");
				pst.setString(3, "Chennai");
				pst.setDouble(4, 50000);
				return pst;
				}
			});
		System.out.println("Added : " + count);
		*/
		List<Emp> empList = jt.query("select * from emp", new RowMapper<Emp>() {
			@Override
			public Emp mapRow(ResultSet rs, int rowNum) throws SQLException{
			return new Emp(rs.getInt("EMPNO"), rs.getString("NAME"),
			rs.getString("ADDRESS"), rs.getDouble("SALARY"));

			}
			});

			for(Emp e: empList) {
			System.out.println(e.getName()+"   "+ e.getCity());
			}
			Emp e= jt.queryForObject("select * from emp where empno=104",  new RowMapper<Emp>() {
			@Override
			public Emp mapRow(ResultSet rs, int rowNum) throws SQLException {
			return new Emp(rs.getInt("EMPNO"), rs.getString("NAME"), rs.getString("ADDRESS"), rs.getDouble("SALARY"));
			}

			});
			System.out.println(e.getName()+" "+e.getCity());
		
		
	}
	
}

