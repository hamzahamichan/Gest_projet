<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Projets</title>
<link rel="stylesheet" type="text/css" herf="css/bootstrap.min.css">
</head>
<body>
     <div class="panel panel-primary" >
       <div class="pannel-heading">recherche projetS</div>
         <div calass="panel-body">
           <form action="chercher.java" method="get">
              <label>mot clé</label>
                <input type="text" name="motCle">
                <button type="submit" class="btn btn.primary">chercher</button>
           </form>
                <table>
                    <tr>
                       <th>ID</th> <th>Nom</th> <th>description</th> <th>debut</th> <th>Fin</th>
                    </tr>
                        <c:forEach items="${model.projets}">
                            <tr>
                                <td>${pr.id_project}</td>
                                <td>${pr.nom}</td>
                                <td>${pr.description}</td>
                                <td>${pr.date_debut}</td>
                                <td>${pr.date_fin}</td>
                                <td>${pr.budget}</td>
                            </tr>
                        
                        
                        </c:forEach>
                
                </table>
         </div>
     </div>
</body>
</html>