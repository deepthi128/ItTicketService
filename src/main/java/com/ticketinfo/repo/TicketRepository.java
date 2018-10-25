package com.ticketinfo.repo;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ticketinfo.data.Ticket;

@Mapper
public interface TicketRepository {
	@Select("select * from ticket")
	public List<Ticket> findAll();

	@Select("SELECT * FROM ticket WHERE id = #{id}")
	public Ticket findById(long id);

	@Delete("DELETE FROM ticket WHERE id = #{id}")
	public int deleteById(long id);

	@Insert("INSERT INTO ticket(id, name, severity, assignee, owner, description, comments) VALUES (#{id}, #{name}, #{severity}, #{assignee}, #{owner}, #{description}, #{comments})")
	public int insert(Ticket ticket);

	@Update("Update ticket set name=#{name}, severity=#{severity}, assignee=#{assignee}, owner=#{owner}, description= #{description}, comments= #{comments}}  where id=#{id}")
	public int update(Ticket ticket);
}