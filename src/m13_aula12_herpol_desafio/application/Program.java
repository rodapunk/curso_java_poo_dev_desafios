package m13_aula12_herpol_desafio.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import m13_aula12_herpol_desafio.entities.Lesson;
import m13_aula12_herpol_desafio.entities.Task;
import m13_aula12_herpol_desafio.entities.Video;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Lesson> list = new ArrayList<>();
		
		System.out.print("Quantas aulas tem o curso? ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("\nDados da " + i + "a aula:");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Título: ");
			sc.nextLine();
			String titulo = sc.nextLine();
			if (ch == 'c') {
				System.out.print("URL do vídeo: ");
				String url = sc.nextLine();
				System.out.print("Duração em segundos: ");
				int seconds = sc.nextInt();
				list.add(new Video(titulo, url, seconds));
			} else {
				System.out.print("Descrição: ");
				String description = sc.nextLine();
				System.out.print("Quantidade de questões: ");
				int questionCount = sc.nextInt();
				list.add(new Task(titulo, description, questionCount));
			}
		}
		
		int sum = 0;
		for (Lesson lesson : list)
			sum += lesson.duration();
		
		System.out.println("\nDURAÇÃO TOTAL DO CURSO = " + sum + " segundos");
			
		sc.close();
	}
}