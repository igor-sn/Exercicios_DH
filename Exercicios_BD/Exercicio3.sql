USE movies_db;

SELECT * FROM actors;
SELECT * FROM seasons;

/*1. Mostrar o título e o nome do gênero de todas as séries.*/
SELECT s.title, g.name
FROM series s
INNER JOIN genres g ON s.genre_id = g.id;

/*2. Mostrar o título dos episódios, o nome e sobrenome dos atores que trabalham em
cada um deles.*/
SELECT ep.title, ac.first_name, ac.last_name
FROM episodes ep 
INNER JOIN actor_episode ep_ac ON ep.id = ep_ac.episode_id
INNER JOIN actors ac ON ep_ac.actor_id = ac.id;

/*3. Mostrar o título de todas as séries e o número total de temporadas que cada uma
delas possui.*/
SELECT sr.title, COUNT(sn.title) AS quantity
FROM series sr
INNER JOIN seasons sn ON sr.id = sn.serie_id
GROUP BY sr.title;

/*4. Mostrar o nome de todos os gêneros e o número total de filmes de cada um, desde
que seja maior ou igual a 3.*/
SELECT g.name, COUNT(m.title) as quantity
FROM genres g
INNER JOIN movies m ON g.id = m.genre_id
GROUP BY g.name
HAVING quantity >= 3;


/*5. Mostrar apenas o nome e sobrenome dos atores que atuam em todos os filmes de
Star Wars e que estes não se repitam.*/
SELECT DISTINCT ac.first_name, ac.last_name
FROM actors ac
INNER JOIN actor_movie ac_mv ON ac.id = ac_mv.actor_id
INNER JOIN movies mv ON ac_mv.movie_id = mv.id
WHERE mv.title LIKE "La Guerra de las galaxias%";



