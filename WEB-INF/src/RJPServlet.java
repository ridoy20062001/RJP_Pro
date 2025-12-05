import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RJPServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        // 文字コードの指定
        req.setCharacterEncoding("UTF-8");

        // 入力JSPから送られてきた値を取得
        String username     = req.getParameter("name");
        String favoritegame = req.getParameter("fav");

        // 出力JSPで使うために属性として保存
        req.setAttribute("name", username);
        req.setAttribute("fav", favoritegame);

        // 出力JSP（output.jsp）へフォワード
        RequestDispatcher dispatcher =
                req.getRequestDispatcher("output");

        dispatcher.forward(req, res);
    }

    // GETで来た場合もPOSTと同じ処理
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        doPost(req, res);
    }
}
