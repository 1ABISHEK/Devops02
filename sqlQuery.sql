create table emp_det(name varchar(30),id int,emg_ph int,address varchar(100),mob_no int,dept varchar(30));

create table emp_sal(id int,b_pay int,dept varchar(40),hra int,da int,ta int,tot_sal int);

insert into emp_sal(id,b_pay,dept,hra,da,ta,tot_sal)
values(1,30000,"IT",'','','',''),(2,30000,"CSE",'','','','');

insert into emp_det(name,id,emg_ph,address,mob_no,dept)
values("abi",1,098765432,'ksrct',1234567890,"IT"),("ab",2,098765432,'ksrct',1234567890,"CSE")

select b_pay*0.10 as hra
from emp_sal

update emp_sal
set tot_sal = round(b_pay+hra+da+ta);
set ta = round(b_pay*0.09)
set da = round(b_pay*0.05)
set hra = round(b_pay*0.10)

select MAX(tot_sal),dept 
from emp_sal
group by dept

select emp_det.*,emp_sal.tot_sal from emp_det
inner join emp_sal on emp_det.id=emp_sal.id
