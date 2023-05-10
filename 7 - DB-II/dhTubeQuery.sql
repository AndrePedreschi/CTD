select * from dhtube.pais;

select * from dhtube.usuario;

select usuario.nome
, usuario.email
, usuario.dataNascimento
, usuario.codigoPostal
, pais.nome as Pais
from dhtube.usuario as usuario 
inner join dhtube.pais as pais on usuario.Pais_idPais = pais.idPais;


select pais.nome as Pais
, count(*) as qtde
from dhtube.usuario as Usuario
inner join dhtube.pais as pais on usuario.Pais_idPais = pais.idPais
group by pais.nome
having count(*) > 1;


select * from dhtube.usuario as usuario
where usuario.dataNascimento between '1975-09-27 00:00:00' and '1998-02-06 00:00:00' limit 3;


select
*
from (

select usuario.idUsuario
, usuario.nome
, usuario.Pais_idPais
 from dhtube.usuario as usuario
where usuario.dataNascimento between '1975-09-27 00:00:00' and '1998-02-06 00:00:00'

) as usuario_red
inner join dhtube.pais as pais on usuario_red.Pais_idPais = pais.idPais;





select usuario_red.*
from (  select usuario.idUsuario
               ,usuario.nome
               ,usuario.Pais_idPais
          from dhtube.usuario as usuario
         where usuario.dataNascimento between '1975-09-27 00:00:00' and '2002-02-06 00:00:00' 
         ) as usuario_red
inner join dhtube.pais as pais on usuario_red.Pais_idPais = pais.idPais;




select 
	playlist.nome
    , video.titulo
    , video.descricao
    , video.tamanho
    , video.qtdLikes
    , video.qtdDislikes
	from dhtube.playlist as playlist
inner join playlist_video as playlistVideo on playlist.idPlaylist = playlistVideo.playlist_idplaylist
inner join video as video on playlistVideo.video_idVideo = video.idVideo 
where upper(playlist.nome) like '%PARA CORRER%';









select count(*) qtdLinhasTotais from dhtube.playlist_video;

   
    #, count(distinct )
    #, count(*)

select 
	playlist.nome
    , video.titulo
    , video.descricao
    , video.tamanho
    , sum(video.qtdLikes) as qtdLikes
    , sum(video.qtdDislikes) as qtdDislikes
	from dhtube.playlist as playlist
inner join dhtube.playlist_video as playlistVideo on playlist.idPlaylist = playlistVideo.playlist_idplaylist
inner join dhtube.video as video on playlistVideo.video_idVideo = video.idVideo 

group by playlist.nome
		, video.titulo
		, video.descricao;

#where upper(playlist.nome) like '%PARA CORRER%'











