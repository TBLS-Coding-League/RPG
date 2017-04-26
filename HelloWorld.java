package me.alex.teacher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Consumer;

public class HelloWorld
{
	public static void main(String[] args)
	{
		System.out.println("Hi! What's your name?");
		
		new HelloWorld();
	}
	
	private boolean _exitRequested = false;
	
	private Map<String, Consumer<String>> RESPONSES = new HashMap<>();
	
	public HelloWorld()
	{
		setup();
		try (InputStreamReader isr = new InputStreamReader(System.in); BufferedReader br = new BufferedReader(isr);)
		{
			while (!_exitRequested)
			{
				String input = br.readLine();
				
				Optional<Consumer<String>> handlerSearch = RESPONSES.entrySet().stream().filter(entry -> input.toUpperCase().contains(entry.getKey())).map(Entry::getValue).findFirst();
				if (!handlerSearch.isPresent())
				{
					System.out.println("I don't know what that means!");
				}
				else
				{
					handlerSearch.get().accept(input);
				}
			}
		}
		catch (IOException ex)
		{
			ex.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private void setup()
	{
		RESPONSES.put("MY NAME IS ", input ->
		{
			System.out.println("Hi " + input.substring(11));
		});
		RESPONSES.put("BYE", input ->
		{
			System.out.println("Goodbye friend!");
			_exitRequested = true;
		});
	}
}