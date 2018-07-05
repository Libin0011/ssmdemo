function  ma(uid)
{
	if(confirm("确认删除吗?"))
	{
	location.href="../user/deleteUser?uid="+uid;
	}
}