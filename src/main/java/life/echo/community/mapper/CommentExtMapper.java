package life.echo.community.mapper;

import life.echo.community.model.Comment;
import life.echo.community.model.CommentExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {
   int incCommentCount(Comment comment);
}