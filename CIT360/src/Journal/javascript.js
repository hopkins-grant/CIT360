$(document).ready(function()
{
	$("#text").html("Welcome!");
	$("#text").fadeIn(2000);
	$("#text").delay(2500).fadeOut(1000);
	
	$("#text").delay(700).queue(function(n)
	{
		$(this).html("It's been a long semester..."); n();
	});
	$("#text").delay(1000).fadeIn(2000);
	$("#text").delay(2500).fadeOut(1000);
	
	$("#text").delay(700).queue(function(n)
	{
		$(this).html("But we're finally done!"); n();
	});
	$("#text").delay(1000).fadeIn(2000);
	$("#text").delay(2500).fadeOut(1000);

	$("#text").delay(700).queue(function(n)
	{
		$(this).html("<a href=options.html>Let's see what we learned</a>"); n();
	});
	$("#text").delay(1000).fadeIn(2000);
	
	$("#continue").delay(22500).fadeIn(2000);
});