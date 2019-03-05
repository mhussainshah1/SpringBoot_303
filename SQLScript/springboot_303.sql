-- drop database courses; --call this if you need to start over
create database courses;
use courses;

-- view the data from MySQL Workbench
select * from course;

# Hibernate put aliases with (table / column name)number_0_
#	Name	|		Alias 
#-------------------------
# 	course	|	course_0
#	id		|	id1_0_
#
#
select course0_.id as id1_0_, 
course0_.credit as credit2_0_, 
course0_.description as descript3_0_, 
course0_.instructor as instruct4_0_, 
course0_.title as title5_0_ from course course0_;